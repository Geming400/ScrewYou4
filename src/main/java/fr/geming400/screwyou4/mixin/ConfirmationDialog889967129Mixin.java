package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.ConfirmationDialog.class)
public class ConfirmationDialog889967129Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2019487908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2019487908L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__245492846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-245492846L))
            info.setReturnValue("?Q|*VBX:Q#}g9@^^Nw%G?D\u9ED8-kK-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_928229871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928229871L))
            info.setReturnValue(1149643931);
    }

    @Inject(at = @At("HEAD"), method = "common()Lnet/minecraft/server/dialog/CommonDialogData;", cancellable = true)
    private void common__2142152613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142152613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onCancel()Ljava/util/Optional;", cancellable = true)
    private void onCancel_1135428551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1135428551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1669146443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1669146443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mainActions()Ljava/util/List;", cancellable = true)
    private void mainActions__1778663351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778663351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "yesButton()Lnet/minecraft/server/dialog/ActionButton;", cancellable = true)
    private void yesButton__86388784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-86388784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noButton()Lnet/minecraft/server/dialog/ActionButton;", cancellable = true)
    private void noButton__86388784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-86388784L))
            info.setReturnValue(null);
    }


}
