package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.DeathMessageType.class)
public class DeathMessageType420757339Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/damagesource/DeathMessageType;", cancellable = true)
    private static void values__1614284867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1614284867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/damagesource/DeathMessageType;", cancellable = true)
    private static void valueOf_1355790880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355790880L))
            info.setReturnValue(net.minecraft.world.damagesource.DeathMessageType.INTENTIONAL_GAME_DESIGN);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__714703132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714703132L))
            info.setReturnValue("s3f@zT)a'᎒)}UF.u7$嬌j5͂}6!K3|7p1l(g㊐np㒩CL 鷎휃W2T7N2-D婓|^8P?+᷂ṧw%\"mk/T{\"\\"9n*⧒v");
    }


}
