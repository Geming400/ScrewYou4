package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.WeatherCheck.class)
public class WeatherCheck1138748548Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_230122280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(230122280L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1909172073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909172073L))
            info.setReturnValue("?O\u706CI-KrN+4ae2xA\u8B39/\uFEFA?]QFM\u59E9\"\uC3F6[W*\uCB1FU\"GH\u41CBi8F8cyRGfB\u7291jaP!JBQ^a{\u16C8\u5B3D:JVvs5nm@<j$w`Gd=]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1696100639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1696100639L))
            info.setReturnValue(-1769311800);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__598223163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-598223163L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void test__266863928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-266863928L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2089773494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089773494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRaining()Ljava/util/Optional;", cancellable = true)
    private void isRaining__95564426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-95564426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weather()Lnet/minecraft/world/level/storage/loot/predicates/WeatherCheck$Builder;", cancellable = true)
    private static void weather_966753335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(966753335L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.predicates.WeatherCheck.Builder());
    }

    @Inject(at = @At("HEAD"), method = "isThundering()Ljava/util/Optional;", cancellable = true)
    private void isThundering__435182726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-435182726L))
            info.setReturnValue(null);
    }


}
