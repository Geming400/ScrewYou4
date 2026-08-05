package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator.Context.class)
public class Context_109700206Mixin {
        @Inject(at = @At("HEAD"), method = "roots()Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void roots_2073989577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073989577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "random()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void random__1939924678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939924678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/WorldGenLevel;", cancellable = true)
    private void level__1835470137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1835470137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkBlock(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;)Z", cancellable = true)
    private void checkBlock_1912192135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1912192135L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlock_1885957923(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1885957923L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAir(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isAir_278470648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(278470648L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "leaves()Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void leaves_2073989577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073989577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeVine(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/properties/BooleanProperty;)V", cancellable = true)
    private void placeVine_1039063110(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1039063110L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "logs()Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void logs_2073989577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073989577L))
            info.setReturnValue(null);
    }


}
