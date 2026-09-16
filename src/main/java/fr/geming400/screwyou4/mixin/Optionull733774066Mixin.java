package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.Optionull.class)
public class Optionull733774066Mixin {
        @Inject(at = @At("HEAD"), method = "map(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", cancellable = true)
    private static void map__1310343619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1310343619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "first(Ljava/util/Collection;)Ljava/lang/Object;", cancellable = true)
    private static void first_1646062244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1646062244L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "orElse(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private static void orElse__158374647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-158374647L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "mapOrElse(Ljava/lang/Object;Ljava/util/function/Function;Ljava/util/function/Supplier;)Ljava/lang/Object;", cancellable = true)
    private static void mapOrElse__422160747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-422160747L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([S)Z", cancellable = true)
    private static void isNullOrEmpty__748865344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748865344L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([I)Z", cancellable = true)
    private static void isNullOrEmpty__758100554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-758100554L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([C)Z", cancellable = true)
    private static void isNullOrEmpty__763641680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763641680L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([J)Z", cancellable = true)
    private static void isNullOrEmpty__757177033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-757177033L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([F)Z", cancellable = true)
    private static void isNullOrEmpty__760871117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760871117L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([D)Z", cancellable = true)
    private static void isNullOrEmpty__762718159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762718159L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([Ljava/lang/Object;)Z", cancellable = true)
    private static void isNullOrEmpty__1868344543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1868344543L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([Z)Z", cancellable = true)
    private static void isNullOrEmpty__742400697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742400697L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([B)Z", cancellable = true)
    private static void isNullOrEmpty__764565201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764565201L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mapOrDefault(Ljava/lang/Object;Ljava/util/function/Function;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private static void mapOrDefault_1577072603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1577072603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "firstOrElse(Ljava/util/Collection;Ljava/util/function/Supplier;)Ljava/lang/Object;", cancellable = true)
    private static void firstOrElse_1530272598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530272598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "firstOrDefault(Ljava/util/Collection;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private static void firstOrDefault__1099849306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099849306L))
            info.setReturnValue(new java.lang.Object());
    }


}
