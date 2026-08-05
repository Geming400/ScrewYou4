package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ModCheck.class)
public class ModCheck_760323396Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__148302873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-148302873L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1530746920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530746920L))
            info.setReturnValue("2\u5C51_8U[){|\uD59Ap)K%H\"#szU7w9oNu\u3309");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1317675486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317675486L))
            info.setReturnValue(752167977);
    }

    @Inject(at = @At("HEAD"), method = "merge(Lnet/minecraft/util/ModCheck;)Lnet/minecraft/util/ModCheck;", cancellable = true)
    private void merge__1705798760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1705798760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__413664312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-413664312L))
            info.setReturnValue("e;tGh\u32ED[j[\u9C3AvC()SqP9[<]ll#]_");
    }

    @Inject(at = @At("HEAD"), method = "fullDescription()Ljava/lang/String;", cancellable = true)
    private void fullDescription_1325082361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325082361L))
            info.setReturnValue("y4m\")\uD381#u2M]94c)i");
    }

    @Inject(at = @At("HEAD"), method = "identify(Ljava/lang/String;Ljava/util/function/Supplier;Ljava/lang/String;Ljava/lang/Class;)Lnet/minecraft/util/ModCheck;", cancellable = true)
    private static void identify__2067573005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067573005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldReportAsModified()Z", cancellable = true)
    private void shouldReportAsModified__1210665224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1210665224L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "confidence()Lnet/minecraft/util/ModCheck$Confidence;", cancellable = true)
    private void confidence__1247038388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1247038388L))
            info.setReturnValue(net.minecraft.util.ModCheck.Confidence.DEFINITELY);
    }


}
