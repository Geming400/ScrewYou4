package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestData.class)
public class TestData_1770832050Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1138622988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138622988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_635372074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(635372074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1809094791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809094791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/gametest/framework/TestData;", cancellable = true)
    private void map_170046361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(170046361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "environment()Ljava/lang/Object;", cancellable = true)
    private void environment__664943028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-664943028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "padding()I", cancellable = true)
    private void padding_1809094295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809094295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "required()Z", cancellable = true)
    private void required_1809110632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809110632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structure()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void structure__672234504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-672234504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void rotation_272510691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(272510691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxAttempts()I", cancellable = true)
    private void maxAttempts_1809094295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809094295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredSuccesses()I", cancellable = true)
    private void requiredSuccesses_1809094295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809094295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "manualOnly()Z", cancellable = true)
    private void manualOnly_1809110632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809110632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupTicks()I", cancellable = true)
    private void setupTicks_1809094295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809094295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skyAccess()Z", cancellable = true)
    private void skyAccess_1809110632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809110632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxTicks()I", cancellable = true)
    private void maxTicks_1809094295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809094295L))
            info.setReturnValue(null);
    }


}
