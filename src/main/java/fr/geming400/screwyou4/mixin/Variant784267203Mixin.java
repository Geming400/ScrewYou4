package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.rabbit.Rabbit.Variant.class)
public class Variant784267203Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/rabbit/Rabbit$Variant;", cancellable = true)
    private static void values__1138308306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138308306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/rabbit/Rabbit$Variant;", cancellable = true)
    private static void valueOf_970848081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970848081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_822529449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(822529449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__351193268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351193268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/rabbit/Rabbit$Variant;", cancellable = true)
    private static void byId__568515904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-568515904L))
            info.setReturnValue(null);
    }


}
