package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.HumanoidArm.class)
public class HumanoidArm607141665Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/HumanoidArm;", cancellable = true)
    private static void values__774735590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-774735590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/HumanoidArm;", cancellable = true)
    private static void valueOf_234713505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(234713505L))
            info.setReturnValue(net.minecraft.world.entity.HumanoidArm.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption_1016666650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1016666650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_695350287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(695350287L))
            info.setReturnValue("Fz.G`D/T_{&d<5ZrC\uA76E|S\u2735mREkr7h2)\u4B5AJx,ZR8/LA{4O}[mN`E*P67xf\uA72Cw\u0414tsaZ`9/UNf>\u58B9\u5335z");
    }

    @Inject(at = @At("HEAD"), method = "getOpposite()Lnet/minecraft/world/entity/HumanoidArm;", cancellable = true)
    private void getOpposite__524692568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-524692568L))
            info.setReturnValue(net.minecraft.world.entity.HumanoidArm.LEFT);
    }


}
