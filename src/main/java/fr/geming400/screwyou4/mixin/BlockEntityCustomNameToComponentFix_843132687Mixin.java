package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BlockEntityCustomNameToComponentFix.class)
public class BlockEntityCustomNameToComponentFix_843132687Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_26995967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(26995967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixTagCustomName(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void fixTagCustomName_1165627398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1165627398L))
            info.setReturnValue(null);
    }


}
