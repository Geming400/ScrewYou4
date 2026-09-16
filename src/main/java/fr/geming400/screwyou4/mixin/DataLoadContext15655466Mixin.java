package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.WorldLoader.DataLoadContext.class)
public class DataLoadContext15655466Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__892970802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-892970802L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_786078991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(786078991L))
            info.setReturnValue("C=9>K>$/\u1AB6=q71z|lThR[(^l2d7|$K\u7FB6efbul7\u3901U.%D\u703E\u8A1A?\uBA82$#1qt]:4&*\u208C.0\u6575f\uA5C3\"gT}HL\"MK\uC53Bi*{\u7346X>zg1i|rcX3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_573007557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(573007557L))
            info.setReturnValue(-2120223904);
    }

    @Inject(at = @At("HEAD"), method = "resources()Lnet/minecraft/server/packs/resources/ResourceManager;", cancellable = true)
    private void resources__28046379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28046379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataConfiguration()Lnet/minecraft/world/level/WorldDataConfiguration;", cancellable = true)
    private void dataConfiguration__993930162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-993930162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "datapackDimensions()Lnet/minecraft/core/RegistryAccess$Frozen;", cancellable = true)
    private void datapackDimensions_1140575841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1140575841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "datapackWorldgen()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void datapackWorldgen__1310226778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1310226778L))
            info.setReturnValue(null);
    }


}
