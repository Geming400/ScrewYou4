package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.SulfurCubeArchetype.AttributeEntry.class)
public class AttributeEntry_2056880413Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__852574625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-852574625L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_921420437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921420437L))
            info.setReturnValue("l+\u9400NMwDomM'93nt\u8474\u55CB/f&_0P4|v)vZ=tWm39&W&ULF\uCEFAN(y2\u2E82/\uB17A(\uADE8S!-\u80B1roM7) D\u5A5A@'fdAa-`j)\u0C01C\u476DOlcC\uA7FB&3A$1>.EQMf");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2095143154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095143154L))
            info.setReturnValue(581732477);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/Holder;DLnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/entity/SulfurCubeArchetype$AttributeEntry;", cancellable = true)
    private static void add_1562895005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1562895005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiply(Lnet/minecraft/core/Holder;DLnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/entity/SulfurCubeArchetype$AttributeEntry;", cancellable = true)
    private static void multiply_1562895005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1562895005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifier()Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;", cancellable = true)
    private void modifier__839565789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-839565789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Lnet/minecraft/core/Holder;", cancellable = true)
    private void attribute__689211112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-689211112L))
            info.setReturnValue(null);
    }


}
