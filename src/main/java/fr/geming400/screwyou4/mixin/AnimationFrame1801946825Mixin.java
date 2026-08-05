package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.animation.AnimationFrame.class)
public class AnimationFrame1801946825Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1840209071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1840209071L))
            info.setReturnValue(-777300716);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1107508212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1107508212L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_666486850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666486850L))
            info.setReturnValue("JI\uAAB0lA-Xl+@8-,LY]2b\uA6D21Km`\u968A\u8635/>\uBE4D6>STIvM`F7rw\u1EB8EGJ\uC2B3,[=K$Pbp\uAD07@ ;(ZE\u6F15R-}nI1g#Mn\u3A9C\uA714=Y6\u4AFB[z>D,Tr-,.LftSv");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1840209567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1840209567L))
            info.setReturnValue(-955824205);
    }

    @Inject(at = @At("HEAD"), method = "time()Ljava/util/Optional;", cancellable = true)
    private void time_2047408247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2047408247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeOr(I)I", cancellable = true)
    private void timeOr__1279115992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1279115992L))
            info.setReturnValue(-1721085909);
    }


}
