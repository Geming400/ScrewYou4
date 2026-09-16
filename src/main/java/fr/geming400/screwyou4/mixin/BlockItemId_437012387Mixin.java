package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.references.BlockItemId.class)
public class BlockItemId_437012387Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__471613882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-471613882L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1207435911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1207435911L))
            info.setReturnValue("\u04CEN0'UL$d\"#\uB02BP_]p272M: \u1B11\u08E7nD9n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_994364477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(994364477L))
            info.setReturnValue(-1274213083);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/references/BlockItemId;", cancellable = true)
    private static void create_2025603212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2025603212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/references/BlockItemId;", cancellable = true)
    private static void create__624665464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-624665464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/references/BlockItemId;", cancellable = true)
    private static void create_606044882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(606044882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void block__907026714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-907026714L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void item__1573603552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1573603552L))
            info.setReturnValue(null);
    }


}
