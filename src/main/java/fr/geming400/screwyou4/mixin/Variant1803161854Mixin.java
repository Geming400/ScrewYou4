package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.cow.MushroomCow.Variant.class)
public class Variant1803161854Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/cow/MushroomCow$Variant;", cancellable = true)
    private static void values_1503794761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1503794761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/cow/MushroomCow$Variant;", cancellable = true)
    private static void valueOf_1178518956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1178518956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_667701383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(667701383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__492597012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-492597012L))
            info.setReturnValue(null);
    }


}
