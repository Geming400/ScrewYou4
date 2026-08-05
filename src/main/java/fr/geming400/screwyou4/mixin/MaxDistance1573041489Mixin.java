package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.JigsawStructure.MaxDistance.class)
public class MaxDistance1573041489Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1336413548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1336413548L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_437581514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437581514L))
            info.setReturnValue("[raj`*-@%M3e");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1611304231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611304231L))
            info.setReturnValue(614529452);
    }

    @Inject(at = @At("HEAD"), method = "horizontal()I", cancellable = true)
    private void horizontal_1611303735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611303735L))
            info.setReturnValue(817676871);
    }

    @Inject(at = @At("HEAD"), method = "vertical()I", cancellable = true)
    private void vertical_1611303735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611303735L))
            info.setReturnValue(817676871);
    }


}
