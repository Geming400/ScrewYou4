package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BlockStateStructureTemplateFix.class)
public class BlockStateStructureTemplateFix1983116238Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__826655223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-826655223L))
            info.setReturnValue(null);
    }


}
