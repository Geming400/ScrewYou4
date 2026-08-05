package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.Blocks.class)
public class Blocks_1875100662Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;)Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private static void register_2056941866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2056941866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/ResourceKey;Ljava/util/function/Function;Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;)Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private static void register_1007741098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1007741098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "never(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void never__518900724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-518900724L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "never(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;)Ljava/lang/Boolean;", cancellable = true)
    private static void never__19255756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-19255756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "always(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;)Ljava/lang/Boolean;", cancellable = true)
    private static void always__19255756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-19255756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "always(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void always__518900724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-518900724L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "litBlockEmission(I)Ljava/util/function/ToIntFunction;", cancellable = true)
    private static void litBlockEmission__148193651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-148193651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "logProperties(Lnet/minecraft/world/level/material/MapColor;Lnet/minecraft/world/level/material/MapColor;Lnet/minecraft/world/level/block/SoundType;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void logProperties_1579946770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579946770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flowerPotProperties()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void flowerPotProperties__1736403930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1736403930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buttonProperties()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void buttonProperties__1736403930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1736403930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ocelotOrParrot(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;)Ljava/lang/Boolean;", cancellable = true)
    private static void ocelotOrParrot__19255756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-19255756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leavesProperties(Lnet/minecraft/world/level/block/SoundType;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void leavesProperties__1381068398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1381068398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "netherStemProperties(Lnet/minecraft/world/level/material/MapColor;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void netherStemProperties_498009322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498009322L))
            info.setReturnValue(null);
    }


}
