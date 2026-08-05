package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.references.BlockItemId.class)
public class BlockItemId_437012387Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1822524645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822524645L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__698447589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-698447589L))
            info.setReturnValue("TiO*\u47815[guT\u82D1H>+\uA3F8\u86E6oDR#\"t\u9213\u2681pk^XSMh X\u1BA1se-gRad2v");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_475275128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(475275128L))
            info.setReturnValue(370055282);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/references/BlockItemId;", cancellable = true)
    private static void create_5977744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(5977744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/references/BlockItemId;", cancellable = true)
    private static void create__1904737140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1904737140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/references/BlockItemId;", cancellable = true)
    private static void create__1843403818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843403818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void block_1245503699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245503699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void item_1245503699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245503699L))
            info.setReturnValue(null);
    }


}
