package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.coordinates.WorldCoordinates.class)
public class WorldCoordinates_739632279Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2125144537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125144537L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__395827697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-395827697L))
            info.setReturnValue("b[*0専䴼<$<[B1ퟗ}6s#?[t腮:V\"vWwk*2%o6J$+cX4tk'p䪐[*a>'yF !ꁏS^V(Vf2[z;2BQ払슿M,F}0>Gj餩9zV;2ﱄz蛓#*/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_777895020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777895020L))
            info.setReturnValue(-256923292);
    }

    @Inject(at = @At("HEAD"), method = "x()Lnet/minecraft/commands/arguments/coordinates/WorldCoordinate;", cancellable = true)
    private void x__447152710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-447152710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseInt(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/coordinates/WorldCoordinates;", cancellable = true)
    private static void parseInt__273702925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-273702925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "z()Lnet/minecraft/commands/arguments/coordinates/WorldCoordinate;", cancellable = true)
    private void z__447152710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-447152710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()Lnet/minecraft/commands/arguments/coordinates/WorldCoordinate;", cancellable = true)
    private void y__447152710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-447152710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseDouble(Lcom/mojang/brigadier/StringReader;Z)Lnet/minecraft/commands/arguments/coordinates/WorldCoordinates;", cancellable = true)
    private static void parseDouble_829400233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(829400233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "absolute(Lnet/minecraft/world/phys/Vec2;)Lnet/minecraft/commands/arguments/coordinates/WorldCoordinates;", cancellable = true)
    private static void absolute_1001750806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1001750806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "absolute(DDD)Lnet/minecraft/commands/arguments/coordinates/WorldCoordinates;", cancellable = true)
    private static void absolute_777807325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777807325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosition(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPosition__1191660719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191660719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isXRelative()Z", cancellable = true)
    private void isXRelative_777910861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777910861L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isYRelative()Z", cancellable = true)
    private void isYRelative_777910861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777910861L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isZRelative()Z", cancellable = true)
    private void isZRelative_777910861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777910861L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRotation(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/world/phys/Vec2;", cancellable = true)
    private void getRotation__1191690510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191690510L))
            info.setReturnValue(null);
    }


}
