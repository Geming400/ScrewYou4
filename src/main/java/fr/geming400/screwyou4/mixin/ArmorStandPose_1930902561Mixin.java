package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.ArmorStand.ArmorStandPose.class)
public class ArmorStandPose_1930902561Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1022276292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1022276292L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1593641211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1593641211L))
            info.setReturnValue("\"j3vlaR+{F>6\u2CC8>a\u3E56F\u1E1E\"A*8_<.\u297E:bc(\"=]Yp#3X#T1$5I/MT\uC247G*[tnAW2?b\uC6E097)H9zm/\uD716/53M#W98\u49CBjrx\u7135M");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1806712645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1806712645L))
            info.setReturnValue(495809735);
    }

    @Inject(at = @At("HEAD"), method = "head()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void head__203856491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-203856491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "body()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void body_1023238359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1023238359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leftArm()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void leftArm__558552246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-558552246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rightArm()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void rightArm__1004264875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1004264875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rightLeg()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void rightLeg_1276108167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1276108167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leftLeg()Lnet/minecraft/core/Rotations;", cancellable = true)
    private void leftLeg_1721820796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1721820796L))
            info.setReturnValue(null);
    }


}
