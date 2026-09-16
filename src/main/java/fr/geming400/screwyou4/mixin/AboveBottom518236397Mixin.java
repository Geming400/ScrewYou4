package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.VerticalAnchor.AboveBottom.class)
public class AboveBottom518236397Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__390389871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-390389871L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1288659426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1288659426L))
            info.setReturnValue("Hk;:\u46D16[bjCoJ;sb/JA?_o:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1075588488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1075588488L))
            info.setReturnValue(-2077022622);
    }

    @Inject(at = @At("HEAD"), method = "offset()I", cancellable = true)
    private void offset_1741356576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1741356576L))
            info.setReturnValue(2067190169);
    }

    @Inject(at = @At("HEAD"), method = "resolveY(Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void resolveY__1744983477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1744983477L))
            info.setReturnValue(-693345441);
    }


}
