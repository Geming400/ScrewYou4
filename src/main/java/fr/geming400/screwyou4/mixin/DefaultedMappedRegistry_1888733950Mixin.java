package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.DefaultedMappedRegistry.class)
public class DefaultedMappedRegistry_1888733950Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(Lnet/minecraft/resources/Identifier;)Ljava/lang/Object;", cancellable = true)
    private void getValue__1826628341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826628341L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getKey(Ljava/lang/Object;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getKey__2146829039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146829039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/ResourceKey;Ljava/lang/Object;Lnet/minecraft/core/RegistrationInfo;)Lnet/minecraft/core/Holder$Reference;", cancellable = true)
    private void register__53319229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-53319229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId(Ljava/lang/Object;)I", cancellable = true)
    private void getId_1025099854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1025099854L))
            info.setReturnValue(240814080);
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Lnet/minecraft/util/RandomSource;)Ljava/util/Optional;", cancellable = true)
    private void getRandom_2068621682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2068621682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOptional(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void getOptional_1097447161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097447161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Ljava/lang/Object;", cancellable = true)
    private void byId__1048295123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1048295123L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getDefaultKey()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getDefaultKey__825000296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-825000296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAny()Ljava/util/Optional;", cancellable = true)
    private void getAny_62268769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(62268769L))
            info.setReturnValue(null);
    }


}
