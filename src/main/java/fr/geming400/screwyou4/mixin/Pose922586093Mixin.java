package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Pose.class)
public class Pose922586093Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/Pose;", cancellable = true)
    private static void values_1804678116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1804678116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/Pose;", cancellable = true)
    private static void valueOf__1240671993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1240671993L))
            info.setReturnValue(net.minecraft.world.entity.Pose.SNIFFING);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_960848339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(960848339L))
            info.setReturnValue(-1649729313);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__212874378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-212874378L))
            info.setReturnValue("ﳈt\"aMぞu\";rue5i-侮(Rq[tp:pMu껯뢻yELEOYg+@zE艹96g]⾼!廮X+j뀦Y:wCa哟뇋^紥됇wtv㳊1⽢r[tUdᎵ나k00x#t.o)ሪQ");
    }


}
