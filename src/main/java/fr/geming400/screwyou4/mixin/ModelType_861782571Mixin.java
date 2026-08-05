package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.nautilus.ZombieNautilusVariant.ModelType.class)
public class ModelType_861782571Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/nautilus/ZombieNautilusVariant$ModelType;", cancellable = true)
    private static void values_1929433186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1929433186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/nautilus/ZombieNautilusVariant$ModelType;", cancellable = true)
    private static void valueOf__1880984737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1880984737L))
            info.setReturnValue(net.minecraft.world.entity.animal.nautilus.ZombieNautilusVariant.ModelType.NORMAL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__273677901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-273677901L))
            info.setReturnValue("z䋫瑇16X,V\"뮬`C{pVV");
    }


}
