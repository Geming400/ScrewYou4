package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.CloudStatus.class)
public class CloudStatus173456521Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/CloudStatus;", cancellable = true)
    private static void values__649962897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-649962897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/CloudStatus;", cancellable = true)
    private static void valueOf__317193162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-317193162L))
            info.setReturnValue(net.minecraft.client.CloudStatus.OFF);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption_582981506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582981506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_261665143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(261665143L))
            info.setReturnValue("i]g>xw8R8\u395CbQs");
    }


}
