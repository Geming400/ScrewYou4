package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityAttachment.class)
public class EntityAttachment1729136642Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/EntityAttachment;", cancellable = true)
    private static void values_693631270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693631270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/EntityAttachment;", cancellable = true)
    private static void valueOf_262552831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262552831L))
            info.setReturnValue(net.minecraft.world.entity.EntityAttachment.VEHICLE);
    }

    @Inject(at = @At("HEAD"), method = "createFallbackPoints(FF)Ljava/util/List;", cancellable = true)
    private void createFallbackPoints__1459725517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1459725517L))
            info.setReturnValue(null);
    }


}
