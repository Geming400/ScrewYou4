package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.nautilus.ZombieNautilusVariant.ModelType.class)
public class ModelType_861782571Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/nautilus/ZombieNautilusVariant$ModelType;", cancellable = true)
    private static void values_1415637888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1415637888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/nautilus/ZombieNautilusVariant$ModelType;", cancellable = true)
    private static void valueOf_904948871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(904948871L))
            info.setReturnValue(net.minecraft.world.entity.animal.nautilus.ZombieNautilusVariant.ModelType.WARM);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_949991192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949991192L))
            info.setReturnValue("{&WVnaQ_s|tK9<xs#-,>W$>(N+AD`\u79B4a-vm?h\"$^VnH)IX0mHB8jkHPw\u61C3W{JiKE]\uD220X48gI\u43DCfJ!W^\u277A/{t");
    }


}
