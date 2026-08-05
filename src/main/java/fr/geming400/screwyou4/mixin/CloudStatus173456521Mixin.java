package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.CloudStatus.class)
public class CloudStatus173456521Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/CloudStatus;", cancellable = true)
    private static void values_18127313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(18127313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/CloudStatus;", cancellable = true)
    private static void valueOf_101554446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(101554446L))
            info.setReturnValue(net.minecraft.client.CloudStatus.FANCY);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption__2003452644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2003452644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__962003950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-962003950L))
            info.setReturnValue("X瘂@qH!H1K|h>");
    }


}
