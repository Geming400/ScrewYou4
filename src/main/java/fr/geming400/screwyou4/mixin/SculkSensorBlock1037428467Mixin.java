package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SculkSensorBlock.class)
public class SculkSensorBlock1037428467Mixin {
        @Inject(at = @At("HEAD"), method = "deactivate(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void deactivate__1032476462(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1032476462L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPhase(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/properties/SculkSensorPhase;", cancellable = true)
    private static void getPhase_1148919521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1148919521L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SculkSensorPhase.COOLDOWN);
    }

    @Inject(at = @At("HEAD"), method = "activate(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;II)V", cancellable = true)
    private void activate_2085051795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2085051795L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1521685105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1521685105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity__548049188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-548049188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void stepOn_352230091(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(352230091L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__916038876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-916038876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__221171300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-221171300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_914826386(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(914826386L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDirectSignal(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)I", cancellable = true)
    private void getDirectSignal_1204482637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1204482637L))
            info.setReturnValue(-1426205141);
    }

    @Inject(at = @At("HEAD"), method = "getActiveTicks()I", cancellable = true)
    private void getActiveTicks_1075690713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1075690713L))
            info.setReturnValue(-1347266671);
    }

    @Inject(at = @At("HEAD"), method = "tryResonateVibration(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private static void tryResonateVibration__1669164423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1669164423L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canActivate(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void canActivate_892139729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(892139729L))
            info.setReturnValue(true);
    }


}
