package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.InsideWorldBoundsPredicate.class)
public class InsideWorldBoundsPredicate150443740Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type_615755285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(615755285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;Ljava/lang/Object;)Z", cancellable = true)
    private void test_1424934969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424934969L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test__1142476088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1142476088L))
            info.setReturnValue(true);
    }


}
