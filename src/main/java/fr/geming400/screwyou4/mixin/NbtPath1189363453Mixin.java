package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.NbtPathArgument.NbtPath.class)
public class NbtPath1189363453Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/nbt/Tag;)I", cancellable = true)
    private void remove_797669923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797669923L))
            info.setReturnValue(-123443837);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/nbt/Tag;)Ljava/util/List;", cancellable = true)
    private void get_1217765357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1217765357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_53902982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53902982L))
            info.setReturnValue("鵿i뮾Z샾 6?7+3*ꭓb䡛1rhE瑨ꁜR㐌(PQJ&Fp9}S+Mr`⨢z{欤@pV蘍垛[nm@92:`u\"}5=% <7A>ey2mT㯺i");
    }

    @Inject(at = @At("HEAD"), method = "insert(ILnet/minecraft/nbt/CompoundTag;Ljava/util/List;)I", cancellable = true)
    private void insert__1386541818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1386541818L))
            info.setReturnValue(-217506427);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/String;)Lnet/minecraft/commands/arguments/NbtPathArgument$NbtPath;", cancellable = true)
    private static void of_1070874146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070874146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/nbt/Tag;Lnet/minecraft/nbt/Tag;)I", cancellable = true)
    private void set_739126499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(739126499L))
            info.setReturnValue(283366787);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreate(Lnet/minecraft/nbt/Tag;Ljava/util/function/Supplier;)Ljava/util/List;", cancellable = true)
    private void getOrCreate__1359338919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1359338919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asString()Ljava/lang/String;", cancellable = true)
    private void asString_53902982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53902982L))
            info.setReturnValue("鵿i뮾Z샾 6?7+3*ꭓb䡛1rhE瑨ꁜR㐌(PQJ&Fp9}S+Mr`⨢z{欤@pV蘍垛[nm@92:`u\"}5=% <7A>ey2mT㯺i");
    }

    @Inject(at = @At("HEAD"), method = "countMatching(Lnet/minecraft/nbt/Tag;)I", cancellable = true)
    private void countMatching_797669923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797669923L))
            info.setReturnValue(-123443837);
    }

    @Inject(at = @At("HEAD"), method = "isTooDeep(Lnet/minecraft/nbt/Tag;I)Z", cancellable = true)
    private static void isTooDeep_1959557349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1959557349L))
            info.setReturnValue(false);
    }


}
