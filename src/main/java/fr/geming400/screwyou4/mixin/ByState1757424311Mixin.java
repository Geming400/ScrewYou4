package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperCollection.ByState.class)
public class ByState1757424311Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1152030726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1152030726L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_621964336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621964336L))
            info.setReturnValue("뗥?2 }㱛");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1795687053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795687053L))
            info.setReturnValue(-742707326);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;", cancellable = true)
    private void map__232080476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-232080476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach__1856526572(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1856526572L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/Object;)Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;", cancellable = true)
    private static void create_255418760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(255418760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pick(Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;)Ljava/lang/Object;", cancellable = true)
    private void pick__353695177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-353695177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unaffected()Ljava/lang/Object;", cancellable = true)
    private void unaffected__678350766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-678350766L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "exposed()Ljava/lang/Object;", cancellable = true)
    private void exposed__678350766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-678350766L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "oxidized()Ljava/lang/Object;", cancellable = true)
    private void oxidized__678350766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-678350766L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "weathered()Ljava/lang/Object;", cancellable = true)
    private void weathered__678350766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-678350766L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "progressMapping(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void progressMapping_19273421(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(19273421L))
            info.cancel();
    }


}
