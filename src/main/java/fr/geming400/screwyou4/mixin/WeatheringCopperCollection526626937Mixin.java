package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperCollection.class)
public class WeatheringCopperCollection526626937Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1912139196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1912139196L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__608833038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608833038L))
            info.setReturnValue("]|_[fH8^,[a\"<|k?Qy8wJ*jC9U1kVJ︶t5LZP");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_564889679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(564889679L))
            info.setReturnValue(-680678144);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/function/Function;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private void apply_917929180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(917929180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/function/Function;Ljava/util/function/Function;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private void apply_28362724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(28362724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private void map_917929180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(917929180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach_1207643350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1207643350L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "asList()Ljava/util/List;", cancellable = true)
    private void asList__2142003543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142003543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private static void create__721159278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721159278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "same(Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private static void same__835518106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-835518106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waxed()Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;", cancellable = true)
    private void waxed__188063378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188063378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weathering()Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;", cancellable = true)
    private void weathering__188063378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188063378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerBlocks(Lnet/minecraft/world/level/block/WeatheringCopperCollection;Lorg/apache/commons/lang3/function/TriFunction;Ljava/util/function/BiFunction;Ljava/util/function/BiFunction;Ljava/util/function/Function;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private static void registerBlocks_2063966476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2063966476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zipMap(Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;Ljava/util/function/BiFunction;)Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;", cancellable = true)
    private static void zipMap__879897743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-879897743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zipMap(Lnet/minecraft/world/level/block/WeatheringCopperCollection;Lnet/minecraft/world/level/block/WeatheringCopperCollection;Ljava/util/function/BiFunction;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private static void zipMap__356033069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-356033069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zipApply(Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void zipApply__184461925(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-184461925L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "zipApply(Lnet/minecraft/world/level/block/WeatheringCopperCollection;Lnet/minecraft/world/level/block/WeatheringCopperCollection;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void zipApply__1708327633(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1708327633L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prefixWithState(Lnet/minecraft/world/level/block/WeatheringCopperCollection;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private static void prefixWithState__1097590096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1097590096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerItems(Lnet/minecraft/world/level/block/WeatheringCopperCollection;Lnet/minecraft/world/level/block/WeatheringCopperCollection;Ljava/util/function/BiFunction;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private static void registerItems__356033069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-356033069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zipUnwaxedWaxed(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void zipUnwaxedWaxed__1211523953(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1211523953L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFamily(Ljava/util/function/BiFunction;Ljava/util/function/BiFunction;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private static void createFamily_1644089852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1644089852L))
            info.setReturnValue(null);
    }


}
