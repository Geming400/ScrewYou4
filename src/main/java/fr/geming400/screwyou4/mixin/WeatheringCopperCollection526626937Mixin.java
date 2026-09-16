package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperCollection.class)
public class WeatheringCopperCollection526626937Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__381999331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-381999331L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1297050462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1297050462L))
            info.setReturnValue("I");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1083979028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1083979028L))
            info.setReturnValue(949018260);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/function/Function;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private void apply__133429202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-133429202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/function/Function;Ljava/util/function/Function;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private void apply__721807918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721807918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private void map__189954816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-189954816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach_43116736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(43116736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "asList()Ljava/util/List;", cancellable = true)
    private void asList__141619559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-141619559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private static void create__215222898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-215222898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "same(Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private static void same_1919532748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919532748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waxed()Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;", cancellable = true)
    private void waxed__932450181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932450181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weathering()Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;", cancellable = true)
    private void weathering_502894300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(502894300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerBlocks(Lnet/minecraft/world/level/block/WeatheringCopperCollection;Lorg/apache/commons/lang3/function/TriFunction;Ljava/util/function/BiFunction;Ljava/util/function/BiFunction;Ljava/util/function/Function;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private static void registerBlocks_882915413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(882915413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zipApply(Lnet/minecraft/world/level/block/WeatheringCopperCollection;Lnet/minecraft/world/level/block/WeatheringCopperCollection;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void zipApply__122802052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-122802052L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "zipApply(Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;Ljava/util/function/BiConsumer;)V", cancellable = true)
    private static void zipApply_1272205032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1272205032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "zipMap(Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;Ljava/util/function/BiFunction;)Lnet/minecraft/world/level/block/WeatheringCopperCollection$ByState;", cancellable = true)
    private static void zipMap_1615915926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1615915926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zipMap(Lnet/minecraft/world/level/block/WeatheringCopperCollection;Lnet/minecraft/world/level/block/WeatheringCopperCollection;Ljava/util/function/BiFunction;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private static void zipMap_2118407416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2118407416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prefixWithState(Lnet/minecraft/world/level/block/WeatheringCopperCollection;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private static void prefixWithState__743780311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-743780311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerItems(Lnet/minecraft/world/level/block/WeatheringCopperCollection;Lnet/minecraft/world/level/block/WeatheringCopperCollection;Ljava/util/function/BiFunction;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private static void registerItems__2028423594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2028423594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFamily(Ljava/util/function/BiFunction;Ljava/util/function/BiFunction;)Lnet/minecraft/world/level/block/WeatheringCopperCollection;", cancellable = true)
    private static void createFamily_170716540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(170716540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "zipUnwaxedWaxed(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void zipUnwaxedWaxed_413863081(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(413863081L))
            info.cancel();
    }


}
