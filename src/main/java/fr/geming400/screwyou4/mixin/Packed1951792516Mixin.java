package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.timers.TimerQueue.Event.Packed.class)
public class Packed1951792516Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__957662521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-957662521L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_816332541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816332541L))
            info.setReturnValue("xhK>B\u45B7XMu}\u6205k]B\uBA7Dq\u5F5Cn#\"14\u797DzY6-<8^$)HN0@b e[$k");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1990055258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990055258L))
            info.setReturnValue(-1137369150);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_816332045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816332045L))
            info.setReturnValue("-Pv\u80A8?\u83BEeL\uB1BEd6'C*R\uCA17\"S\u6C8D]g\u1140Jbie!^\uBB93%q'&\"w_L\"y$xyj\u937Ad-E");
    }

    @Inject(at = @At("HEAD"), method = "callback()Lnet/minecraft/world/level/timers/TimerCallback;", cancellable = true)
    private void callback__46527699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-46527699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerTime()J", cancellable = true)
    private void triggerTime_1990055723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990055723L))
            info.setReturnValue(9164978067248878495L);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__1859496805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1859496805L))
            info.setReturnValue(null);
    }


}
