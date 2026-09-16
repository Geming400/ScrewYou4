package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.Blocks.class)
public class Blocks_1875100662Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;)Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private static void register_1728720103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1728720103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/ResourceKey;Ljava/util/function/Function;Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;)Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private static void register__623263219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623263219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "never(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;)Ljava/lang/Boolean;", cancellable = true)
    private static void never_795560640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(795560640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "never(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void never__1546141184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1546141184L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "always(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void always__1393867619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1393867619L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "always(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;)Ljava/lang/Boolean;", cancellable = true)
    private static void always__790808893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-790808893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ocelotOrParrot(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/EntityType;)Ljava/lang/Boolean;", cancellable = true)
    private static void ocelotOrParrot_1291011533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291011533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "litBlockEmission(I)Ljava/util/function/ToIntFunction;", cancellable = true)
    private static void litBlockEmission_952898576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(952898576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "logProperties(Lnet/minecraft/world/level/material/MapColor;Lnet/minecraft/world/level/material/MapColor;Lnet/minecraft/world/level/block/SoundType;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void logProperties__2121342487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121342487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "netherStemProperties(Lnet/minecraft/world/level/material/MapColor;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void netherStemProperties__1950373058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1950373058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buttonProperties()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void buttonProperties_1150221633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1150221633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "leavesProperties(Lnet/minecraft/world/level/block/SoundType;)Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void leavesProperties_458047105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(458047105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flowerPotProperties()Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;", cancellable = true)
    private static void flowerPotProperties_821697913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821697913L))
            info.setReturnValue(null);
    }


}
