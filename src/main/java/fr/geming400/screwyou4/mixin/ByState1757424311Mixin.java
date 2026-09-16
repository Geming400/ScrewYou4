package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperCollection.ByState.class)
public class ByState1757424311Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_848798043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(848798043L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1767119460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1767119460L))
            info.setReturnValue("3-M8CTl\uA9BEk1_\u41449lTa(:p4Nh\u069D/rZ9i?w6W5!`\u37B9qY(i|{<OK@reWUPa{c0Ow7N\uBDEBu0u\u248Dc\uC810R2Q\u6C9F9*a");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1980190894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980190894L))
            info.setReturnValue(944193437);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;", cancellable = true)
    private void map__969318456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-969318456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach_1273914110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1273914110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/Object;)Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;", cancellable = true)
    private static void create__1716150396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1716150396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pick(Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;)Ljava/lang/Object;", cancellable = true)
    private void pick_240132278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240132278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unaffected()Ljava/lang/Object;", cancellable = true)
    private void unaffected_1578520735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578520735L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "oxidized()Ljava/lang/Object;", cancellable = true)
    private void oxidized__764523098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764523098L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "weathered()Ljava/lang/Object;", cancellable = true)
    private void weathered__485554267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-485554267L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "exposed()Ljava/lang/Object;", cancellable = true)
    private void exposed__1334575758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334575758L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "progressMapping(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void progressMapping_1280904238(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1280904238L))
            info.cancel();
    }


}
