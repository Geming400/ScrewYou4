package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.WorldLoader.DataLoadContext.class)
public class DataLoadContext15655466Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1401167725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1401167725L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1119804509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1119804509L))
            info.setReturnValue("V0 -L\u1D6BR\"&Zp^c3\uA0F0\uFBC2|DIGD'FVQ$1S[+byuc@Zj");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_53918208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53918208L))
            info.setReturnValue(275970175);
    }

    @Inject(at = @At("HEAD"), method = "resources()Lnet/minecraft/server/packs/resources/ResourceManager;", cancellable = true)
    private void resources_860501488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(860501488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "datapackDimensions()Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void datapackDimensions__233094799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-233094799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "datapackWorldgen()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void datapackWorldgen__297551867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-297551867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataConfiguration()Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private void dataConfiguration_932881378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932881378L))
            info.setReturnValue(null);
    }


}
