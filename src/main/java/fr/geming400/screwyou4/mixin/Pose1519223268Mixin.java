package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.parrot.ParrotModel.Pose.class)
public class Pose1519223268Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/model/animal/parrot/ParrotModel$Pose;", cancellable = true)
    private static void values__1799461045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1799461045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/model/animal/parrot/ParrotModel$Pose;", cancellable = true)
    private static void valueOf__229082268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-229082268L))
            info.setReturnValue(net.minecraft.client.model.animal.parrot.ParrotModel.Pose.ON_SHOULDER);
    }


}
