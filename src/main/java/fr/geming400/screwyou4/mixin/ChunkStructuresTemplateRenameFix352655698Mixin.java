package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ChunkStructuresTemplateRenameFix.class)
public class ChunkStructuresTemplateRenameFix352655698Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__463481021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-463481021L))
            info.setReturnValue(null);
    }


}
