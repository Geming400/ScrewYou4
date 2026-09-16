package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator.Context.class)
public class Context_109700206Mixin {
        @Inject(at = @At("HEAD"), method = "roots()Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void roots__634249640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-634249640L))
            info.setReturnValue(new it.unimi.dsi.fastutil.objects.ObjectArrayList());
    }

    @Inject(at = @At("HEAD"), method = "random()Lnet/minecraft/util/RandomSource;", cancellable = true)
    private void random_2096628311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096628311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/WorldGenLevel;", cancellable = true)
    private void level__1837351485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1837351485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "checkBlock(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;)Z", cancellable = true)
    private void checkBlock__1654462228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654462228L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "placeVine(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/properties/BooleanProperty;)V", cancellable = true)
    private void placeVine__1311053545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1311053545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlock(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlock__489387794(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-489387794L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAir(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isAir__1305797704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1305797704L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "leaves()Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void leaves__761848915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-761848915L))
            info.setReturnValue(new it.unimi.dsi.fastutil.objects.ObjectArrayList());
    }

    @Inject(at = @At("HEAD"), method = "logs()Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void logs__1475791942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1475791942L))
            info.setReturnValue(null);
    }


}
