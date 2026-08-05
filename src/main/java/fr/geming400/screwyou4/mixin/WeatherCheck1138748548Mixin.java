package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.WeatherCheck.class)
public class WeatherCheck1138748548Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1770706489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1770706489L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_3288573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(3288573L))
            info.setReturnValue("++=PvW\uC9D3,\u3EBA\uA260ITzJP\u3DF5$bu=\uBA01\u87F44wK7X4Y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1177011290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1177011290L))
            info.setReturnValue(-410088342);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1770578025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1770578025L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__1238200550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1238200550L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1420365024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1420365024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weather()Lnet/minecraft/world/level/storage/loot/predicates/WeatherCheck$Builder;", cancellable = true)
    private static void weather_817181251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(817181251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRaining()Ljava/util/Optional;", cancellable = true)
    private void isRaining_1384209970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384209970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isThundering()Ljava/util/Optional;", cancellable = true)
    private void isThundering_1384209970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384209970L))
            info.setReturnValue(null);
    }


}
