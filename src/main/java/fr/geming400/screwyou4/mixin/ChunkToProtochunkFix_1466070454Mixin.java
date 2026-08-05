package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ChunkToProtochunkFix.class)
public class ChunkToProtochunkFix_1466070454Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_649933734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649933734L))
            info.setReturnValue(null);
    }


}
