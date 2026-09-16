package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.sniffer.Sniffer.State.class)
public class State_1464470638Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/sniffer/Sniffer$State;", cancellable = true)
    private static void values__545222538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-545222538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/sniffer/Sniffer$State;", cancellable = true)
    private static void valueOf_949147343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949147343L))
            info.setReturnValue(net.minecraft.world.entity.animal.sniffer.Sniffer.State.RISING);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__1230713320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1230713320L))
            info.setReturnValue(-1960029342);
    }


}
