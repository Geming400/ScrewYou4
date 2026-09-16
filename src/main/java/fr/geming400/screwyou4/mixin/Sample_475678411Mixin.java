package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.DragonFlightHistory.Sample.class)
public class Sample_475678411Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__432947858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-432947858L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1246101935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1246101935L))
            info.setReturnValue("^\u3305s:2|')nRGd ,,f\uC958\u1DA0@I9\u4DD3tM4-h\u5D7EiJKs\u36A0id5ycN'MoooS<h\u4D5D,Ij");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1033030501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1033030501L))
            info.setReturnValue(-1978727974);
    }

    @Inject(at = @At("HEAD"), method = "y()D", cancellable = true)
    private void y__316904174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-316904174L))
            info.setReturnValue(9.502283009859308E8D);
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot_786481551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(786481551L))
            info.setReturnValue(9.502283E8F);
    }


}
