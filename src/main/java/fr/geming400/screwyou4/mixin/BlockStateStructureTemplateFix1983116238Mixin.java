package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BlockStateStructureTemplateFix.class)
public class BlockStateStructureTemplateFix1983116238Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_1166979519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166979519L))
            info.setReturnValue(null);
    }


}
