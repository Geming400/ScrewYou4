package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityAttachment.class)
public class EntityAttachment1729136642Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/EntityAttachment;", cancellable = true)
    private static void values__201742204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-201742204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/EntityAttachment;", cancellable = true)
    private static void valueOf_1829744935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1829744935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFallbackPoints(FF)Ljava/util/List;", cancellable = true)
    private void createFallbackPoints_1672470386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1672470386L))
            info.setReturnValue(null);
    }


}
