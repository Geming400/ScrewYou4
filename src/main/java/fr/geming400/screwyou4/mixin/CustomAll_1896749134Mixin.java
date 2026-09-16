package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.action.CustomAll.class)
public class CustomAll_1896749134Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_988122865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(988122865L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1627794638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1627794638L))
            info.setReturnValue("I|9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1840866072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1840866072L))
            info.setReturnValue(-879620959);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__696028753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-696028753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "additions()Ljava/util/Optional;", cancellable = true)
    private void additions_1479637490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479637490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1331772909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1331772909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAction(Ljava/util/Map;)Ljava/util/Optional;", cancellable = true)
    private void createAction__1788231090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1788231090L))
            info.setReturnValue(null);
    }


}
