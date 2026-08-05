package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.HumanoidArm.class)
public class HumanoidArm607141665Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/HumanoidArm;", cancellable = true)
    private static void values_1021060860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1021060860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/HumanoidArm;", cancellable = true)
    private static void valueOf__1749678983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749678983L))
            info.setReturnValue(net.minecraft.world.entity.HumanoidArm.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption__1569767500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569767500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOpposite()Lnet/minecraft/world/entity/HumanoidArm;", cancellable = true)
    private void getOpposite__1979074869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1979074869L))
            info.setReturnValue(net.minecraft.world.entity.HumanoidArm.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__528318806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-528318806L))
            info.setReturnValue("E)UEFP]Mci^U졔8['ACwjZl};%yhKϙᾷ2*g퀋Le##!YiDTA쐻'ISo剔");
    }


}
