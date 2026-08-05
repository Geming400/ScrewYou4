package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.Optionull.class)
public class Optionull733774066Mixin {
        @Inject(at = @At("HEAD"), method = "map(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", cancellable = true)
    private static void map_1113426457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1113426457L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "first(Ljava/util/Collection;)Ljava/lang/Object;", cancellable = true)
    private static void first_725311476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725311476L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "orElse(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private static void orElse__894180787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-894180787L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "mapOrElse(Ljava/lang/Object;Ljava/util/function/Function;Ljava/util/function/Supplier;)Ljava/lang/Object;", cancellable = true)
    private static void mapOrElse_799351389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(799351389L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "firstOrElse(Ljava/util/Collection;Ljava/util/function/Supplier;)Ljava/lang/Object;", cancellable = true)
    private static void firstOrElse__1368768926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1368768926L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "firstOrDefault(Ljava/util/Collection;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private static void firstOrDefault__1153628136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1153628136L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "mapOrDefault(Ljava/lang/Object;Ljava/util/function/Function;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private static void mapOrDefault__1148660995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148660995L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([J)Z", cancellable = true)
    private static void isNullOrEmpty_254146928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(254146928L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([I)Z", cancellable = true)
    private static void isNullOrEmpty_253223407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253223407L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([S)Z", cancellable = true)
    private static void isNullOrEmpty_262458617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262458617L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([F)Z", cancellable = true)
    private static void isNullOrEmpty_250452844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(250452844L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([D)Z", cancellable = true)
    private static void isNullOrEmpty_248605802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(248605802L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([Ljava/lang/Object;)Z", cancellable = true)
    private static void isNullOrEmpty__1502504952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502504952L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([Z)Z", cancellable = true)
    private static void isNullOrEmpty_268923264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268923264L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([B)Z", cancellable = true)
    private static void isNullOrEmpty_246758760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(246758760L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isNullOrEmpty([C)Z", cancellable = true)
    private static void isNullOrEmpty_247682281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(247682281L))
            info.setReturnValue(false);
    }


}
