package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.VerticalAnchor.AboveBottom.class)
public class AboveBottom518236397Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1903748656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1903748656L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__617224074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-617224074L))
            info.setReturnValue("K*t/$\u5838]a-UOG1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_556499139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(556499139L))
            info.setReturnValue(1442894135);
    }

    @Inject(at = @At("HEAD"), method = "offset()I", cancellable = true)
    private void offset_556498643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(556498643L))
            info.setReturnValue(2078868742);
    }

    @Inject(at = @At("HEAD"), method = "resolveY(Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void resolveY__1922312610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1922312610L))
            info.setReturnValue(1232004489);
    }


}
