package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.StorageValue.class)
public class StorageValue666910676Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__241715592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-241715592L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1437334201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437334201L))
            info.setReturnValue("\u2C7A|_{}l!\u85B9ATjms5'\uA5487a\uC0FD!T>lGf.gK=\u750F(5]r7V&y=#\\\"\u9FB8Y)b\u745E=vh`|H\u90C1_=dh\uD34A9*6@Iw_M\"T\u2F01}=\u5AF2V");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1224262767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1224262767L))
            info.setReturnValue(-1837340068);
    }

    @Inject(at = @At("HEAD"), method = "getInt(Lnet/minecraft/world/level/storage/loot/LootContext;)I", cancellable = true)
    private void getInt_1398870016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398870016L))
            info.setReturnValue(2070665911);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat_437439856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437439856L))
            info.setReturnValue(2.882497E8F);
    }

    @Inject(at = @At("HEAD"), method = "path()Lnet/minecraft/commands/arguments/NbtPathArgument$NbtPath;", cancellable = true)
    private void path__92736464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-92736464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "storage()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void storage__1847791978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847791978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1733355930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1733355930L))
            info.setReturnValue(null);
    }


}
