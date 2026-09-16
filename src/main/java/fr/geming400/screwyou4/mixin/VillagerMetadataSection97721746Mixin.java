package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.animation.VillagerMetadataSection.class)
public class VillagerMetadataSection97721746Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__810904522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-810904522L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_868145271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868145271L))
            info.setReturnValue("X)L\uCC56r\u0F1C=9i%]#H7\uD233Ys\u170Chyy(\u987C$Xfqb\"luNyR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_655073837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655073837L))
            info.setReturnValue(-926745559);
    }

    @Inject(at = @At("HEAD"), method = "hat()Lnet/minecraft/client/resources/metadata/animation/VillagerMetadataSection$Hat;", cancellable = true)
    private void hat__81151291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81151291L))
            info.setReturnValue(net.minecraft.client.resources.metadata.animation.VillagerMetadataSection.Hat.PARTIAL);
    }


}
