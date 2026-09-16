package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestData.class)
public class TestData_1770832050Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_862205781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862205781L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1753711722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1753711722L))
            info.setReturnValue("\u4C17rZrK>mZe\u576DDx\u4E43H\u34207W?!VL&S89jPx\u50617\uD51Dj\";V;]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1966783156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1966783156L))
            info.setReturnValue(-614731202);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/gametest/framework/TestData;", cancellable = true)
    private void map__362656011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-362656011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "environment()Ljava/lang/Object;", cancellable = true)
    private void environment_907794463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907794463L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "padding()I", cancellable = true)
    private void padding__1850983130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1850983130L))
            info.setReturnValue(-1948325298);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void rotation_611570145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611570145L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.CLOCKWISE_180);
    }

    @Inject(at = @At("HEAD"), method = "required()Z", cancellable = true)
    private void required__1516693975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516693975L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "structure()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void structure__1827798421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827798421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxTicks()I", cancellable = true)
    private void maxTicks__1277631899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1277631899L))
            info.setReturnValue(-335374932);
    }

    @Inject(at = @At("HEAD"), method = "skyAccess()Z", cancellable = true)
    private void skyAccess_1453390755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1453390755L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "manualOnly()Z", cancellable = true)
    private void manualOnly_1088829718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1088829718L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setupTicks()I", cancellable = true)
    private void setupTicks__1506104258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506104258L))
            info.setReturnValue(-931124208);
    }

    @Inject(at = @At("HEAD"), method = "maxAttempts()I", cancellable = true)
    private void maxAttempts__1751181299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751181299L))
            info.setReturnValue(899674357);
    }

    @Inject(at = @At("HEAD"), method = "requiredSuccesses()I", cancellable = true)
    private void requiredSuccesses_1084572357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1084572357L))
            info.setReturnValue(591052210);
    }


}
