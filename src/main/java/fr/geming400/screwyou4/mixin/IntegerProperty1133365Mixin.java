package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.IntegerProperty.class)
public class IntegerProperty1133365Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Ljava/lang/Comparable;)Ljava/lang/String;", cancellable = true)
    private void getName_568693054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568693054L))
            info.setReturnValue("zi'c");
    }

    @Inject(at = @At("HEAD"), method = "getName(Ljava/lang/Integer;)Ljava/lang/String;", cancellable = true)
    private void getName__340203952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-340203952L))
            info.setReturnValue(")yWD` `Yqg<_aHX6d\uAA7A\u119FMaVPW\u398E/;\u1670mx+.1[Qae?\uC820T(jM\uA8E6/\u9E27a o1y9R2O");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__907493399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-907493399L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getValue(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getValue_910253716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(910253716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;II)Lnet/minecraft/world/level/block/state/properties/IntegerProperty;", cancellable = true)
    private static void create_1459309498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1459309498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateHashCode()I", cancellable = true)
    private void generateHashCode__370659733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-370659733L))
            info.setReturnValue(-1741047882);
    }

    @Inject(at = @At("HEAD"), method = "getInternalIndex(Ljava/lang/Integer;)I", cancellable = true)
    private void getInternalIndex_275605159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(275605159L))
            info.setReturnValue(1917555329);
    }

    @Inject(at = @At("HEAD"), method = "getInternalIndex(Ljava/lang/Comparable;)I", cancellable = true)
    private void getInternalIndex_536923645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536923645L))
            info.setReturnValue(371927009);
    }

    @Inject(at = @At("HEAD"), method = "getPossibleValues()Ljava/util/List;", cancellable = true)
    private void getPossibleValues__200027698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-200027698L))
            info.setReturnValue(null);
    }


}
